
PN = "rubygem-coderay"
PE = "0"
PV = "1.1.3"
PR = "9.el10"
PACKAGES = "rubygem-coderay rubygem-coderay-doc"


URI_rubygem-coderay = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-coderay-1.1.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-coderay = "/usr/bin/ruby ( ) ruby(rubygems) ( )"
RPROVIDES:rubygem-coderay = "rubygem-coderay ( =  1.1.3-9.el10) rubygem(coderay) ( =  1.1.3)"

URI_rubygem-coderay-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-coderay-doc-1.1.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-coderay-doc = "rubygem-coderay ( =  1.1.3-9.el10)"
RPROVIDES:rubygem-coderay-doc = "rubygem-coderay-doc ( =  1.1.3-9.el10)"
