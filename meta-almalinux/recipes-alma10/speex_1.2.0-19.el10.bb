
inherit dnf-bridge

PN = "speex"
PE = "0"
PV = "1.2.0"
PR = "19.el10"
PACKAGES = "speex speex-devel speex-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/speex-1.2.0-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_speex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speex-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speex}"
RDEPENDS:speex = " \
 glibc \
"

URI_speex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speex-devel-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speex-devel}"
RDEPENDS:speex-devel = " \
 speex \
 pkgconf-pkg-config \
"

URI_speex-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/speex-tools-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speex-tools}"
RDEPENDS:speex-tools = " \
 glibc \
 speex \
 libogg \
 speexdsp \
"
