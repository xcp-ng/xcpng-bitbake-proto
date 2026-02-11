
PN = "libxcb"
PE = "0"
PV = "1.17.0"
PR = "3.el10"
PACKAGES = "libxcb libxcb-devel libxcb-doc"


URI_libxcb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcb-1.17.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcb = " \
 glibc \
 libXau \
"

URI_libxcb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcb-devel-1.17.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcb-devel = " \
 libxcb \
 libxcb-devel \
 pkgconf-pkg-config \
 libXau-devel \
"

URI_libxcb-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxcb-doc-1.17.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libxcb-doc = ""
