
inherit dnf-bridge

PN = "lksctp-tools"
PE = "0"
PV = "1.0.21"
PR = "1.el10"
PACKAGES = "lksctp-tools lksctp-tools-devel lksctp-tools-doc"


URI_lksctp-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lksctp-tools-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools = " \
 glibc \
 bash \
"

URI_lksctp-tools-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lksctp-tools-devel-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools-devel = " \
 lksctp-tools \
 pkgconf-pkg-config \
"

URI_lksctp-tools-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lksctp-tools-doc-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools-doc = " \
 lksctp-tools \
"
