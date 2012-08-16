.PHONY: cleantags

tags: $(shell find {app,src,common,modules} -type f -name "*scala" -o -name "*js" -newer tags -not -name ".*.swp")
	ctags --languages=Scala,JavaScript --exclude target -R app src common modules

cleantags:
	rm tags
