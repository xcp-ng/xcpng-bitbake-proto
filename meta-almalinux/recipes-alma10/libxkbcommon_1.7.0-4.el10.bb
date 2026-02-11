
PN = "libxkbcommon"
PE = "0"
PV = "1.7.0"
PR = "4.el10"
PACKAGES = "libxkbcommon libxkbcommon-devel libxkbcommon-x11 libxkbcommon-x11-devel libxkbcommon-utils libxkbcommon-x11-utils"


URI_libxkbcommon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon = " \
 glibc \
 xkeyboard-config \
 libxml2 \
"

URI_libxkbcommon-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-devel-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-devel = " \
 libxml2-devel \
 libxkbcommon \
 pkgconf-pkg-config \
"

URI_libxkbcommon-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-x11-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11 = " \
 glibc \
 libxcb \
 libxkbcommon \
"

URI_libxkbcommon-x11-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxkbcommon-x11-devel-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11-devel = " \
 libxkbcommon-devel \
 libxkbcommon-x11 \
 pkgconf-pkg-config \
 libxcb-devel \
"

URI_libxkbcommon-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxkbcommon-utils-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-utils = " \
 glibc \
 libxkbcommon \
 libwayland-client \
"

URI_libxkbcommon-x11-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxkbcommon-x11-utils-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11-utils = " \
 libxkbcommon-utils \
 libxcb \
 glibc \
 libxkbcommon \
 libxkbcommon-x11 \
"
