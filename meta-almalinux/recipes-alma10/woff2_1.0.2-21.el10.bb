
inherit dnf-bridge

PN = "woff2"
PE = "0"
PV = "1.0.2"
PR = "21.el10"
PACKAGES = "woff2 woff2-devel woff2-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/woff2-1.0.2-21.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_woff2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/woff2-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_woff2}"
RDEPENDS:woff2 = " \
 glibc \
 libbrotli \
 libgcc \
 libstdc++ \
"

URI_woff2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/woff2-devel-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_woff2-devel}"
RDEPENDS:woff2-devel = " \
 woff2 \
 brotli-devel \
 woff2-devel \
 pkgconf-pkg-config \
"

URI_woff2-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/woff2-tools-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_woff2-tools}"
RDEPENDS:woff2-tools = " \
 glibc \
 woff2 \
 libgcc \
 libstdc++ \
"
