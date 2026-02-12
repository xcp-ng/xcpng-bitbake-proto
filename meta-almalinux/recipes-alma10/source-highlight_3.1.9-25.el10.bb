
inherit dnf-bridge

PN = "source-highlight"
PE = "0"
PV = "3.1.9"
PR = "25.el10"
PACKAGES = "source-highlight source-highlight-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/source-highlight-3.1.9-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_source-highlight = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/source-highlight-3.1.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_source-highlight}"
RDEPENDS:source-highlight = " \
 libgcc \
 boost-regex \
 libstdc++ \
 bash \
 glibc \
"

URI_source-highlight-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/source-highlight-devel-3.1.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_source-highlight-devel}"
RDEPENDS:source-highlight-devel = " \
 source-highlight \
 pkgconf-pkg-config \
 boost-devel \
"
