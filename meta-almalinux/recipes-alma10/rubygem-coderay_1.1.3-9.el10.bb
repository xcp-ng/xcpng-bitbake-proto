
inherit dnf-bridge

PN = "rubygem-coderay"
PE = "0"
PV = "1.1.3"
PR = "9.el10"
PACKAGES = "rubygem-coderay rubygem-coderay-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rubygem-coderay-1.1.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-coderay = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-coderay-1.1.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-coderay}"
RDEPENDS:rubygem-coderay = " \
 rubygems \
 ruby \
"

URI_rubygem-coderay-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-coderay-doc-1.1.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-coderay-doc}"
RDEPENDS:rubygem-coderay-doc = " \
 rubygem-coderay \
"
