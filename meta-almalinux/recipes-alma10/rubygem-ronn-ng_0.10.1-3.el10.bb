
PN = "rubygem-ronn-ng"
PE = "0"
PV = "0.10.1"
PR = "3.el10"
PACKAGES = "rubygem-ronn-ng rubygem-ronn-ng-doc"


URI_rubygem-ronn-ng = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-ronn-ng-0.10.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-ronn-ng = "/usr/bin/ruby ( ) ruby(rubygems) ( ) /usr/bin/groff ( ) rubygem(kramdown) ( with  (REL)) rubygem(kramdown-parser-gfm) ( with  (REL)) rubygem(mustache) ( with  (REL)) rubygem(nokogiri) ( with  (REL))"
RPROVIDES:rubygem-ronn-ng = "rubygem-ronn-ng ( =  0.10.1-3.el10) rubygem(ronn-ng) ( =  0.10.1) rubygem-ronn ( =  0.10.1-3.el10)"

URI_rubygem-ronn-ng-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-ronn-ng-doc-0.10.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-ronn-ng-doc = "rubygem-ronn-ng ( =  0.10.1-3.el10)"
RPROVIDES:rubygem-ronn-ng-doc = "rubygem-ronn-ng-doc ( =  0.10.1-3.el10)"
