
inherit dnf-bridge

PN = "rubygem-mustache"
PE = "0"
PV = "1.1.1"
PR = "10.el10"
PACKAGES = "rubygem-mustache rubygem-mustache-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rubygem-mustache-1.1.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-mustache = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-mustache-1.1.1-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-mustache}"
RDEPENDS:rubygem-mustache = " \
 rubygems \
 ruby \
"

URI_rubygem-mustache-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-mustache-doc-1.1.1-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-mustache-doc}"
RDEPENDS:rubygem-mustache-doc = " \
 rubygem-mustache \
"
