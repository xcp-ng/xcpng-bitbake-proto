
inherit dnf-bridge

PN = "rubygem-kramdown-parser-gfm"
PE = "0"
PV = "1.1.0"
PR = "14.el10"
PACKAGES = "rubygem-kramdown-parser-gfm rubygem-kramdown-parser-gfm-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rubygem-kramdown-parser-gfm-1.1.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-kramdown-parser-gfm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-kramdown-parser-gfm-1.1.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-kramdown-parser-gfm}"
RDEPENDS:rubygem-kramdown-parser-gfm = " \
 rubygems \
 rubygem-kramdown \
"

URI_rubygem-kramdown-parser-gfm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-kramdown-parser-gfm-doc-1.1.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-kramdown-parser-gfm-doc}"
RDEPENDS:rubygem-kramdown-parser-gfm-doc = " \
 rubygem-kramdown-parser-gfm \
"
