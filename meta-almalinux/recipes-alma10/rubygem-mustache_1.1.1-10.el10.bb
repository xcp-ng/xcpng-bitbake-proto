
PN = "rubygem-mustache"
PE = "0"
PV = "1.1.1"
PR = "10.el10"
PACKAGES = "rubygem-mustache rubygem-mustache-doc"


URI_rubygem-mustache = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-mustache-1.1.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-mustache = "/usr/bin/ruby ( ) ruby(rubygems) ( )"
RPROVIDES:rubygem-mustache = "rubygem-mustache ( =  1.1.1-10.el10) rubygem(mustache) ( =  1.1.1)"

URI_rubygem-mustache-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-mustache-doc-1.1.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-mustache-doc = "rubygem-mustache ( =  1.1.1-10.el10)"
RPROVIDES:rubygem-mustache-doc = "rubygem-mustache-doc ( =  1.1.1-10.el10)"
