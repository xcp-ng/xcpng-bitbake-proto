
inherit dnf-bridge

PN = "rubygem-kramdown"
PE = "0"
PV = "2.4.0"
PR = "10.el10"
PACKAGES = "rubygem-kramdown rubygem-kramdown-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rubygem-kramdown-2.4.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-kramdown = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-kramdown-2.4.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-kramdown}"
RDEPENDS:rubygem-kramdown = " \
 rubygems \
 rubygem-rexml \
 ruby-libs \
 ruby \
"

URI_rubygem-kramdown-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-kramdown-doc-2.4.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-kramdown-doc}"
RDEPENDS:rubygem-kramdown-doc = " \
 rubygem-kramdown \
"
