
inherit dnf-bridge

PN = "rubygem-ronn-ng"
PE = "0"
PV = "0.10.1"
PR = "3.el10"
PACKAGES = "rubygem-ronn-ng rubygem-ronn-ng-doc"


URI_rubygem-ronn-ng = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-ronn-ng-0.10.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-ronn-ng = " \
 ruby \
 groff-base \
 rubygem-kramdown \
 rubygem-kramdown-parser-gfm \
 rubygem-mustache \
 rubygems \
 rubygem-nokogiri \
"

URI_rubygem-ronn-ng-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-ronn-ng-doc-0.10.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-ronn-ng-doc = " \
 rubygem-ronn-ng \
"
