
PN = "soundtouch"
PE = "0"
PV = "2.3.1"
PR = "8.el10"
PACKAGES = "soundtouch soundtouch-devel"


URI_soundtouch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/soundtouch-2.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:soundtouch = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_soundtouch-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/soundtouch-devel-2.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:soundtouch-devel = " \
 soundtouch \
 cmake-filesystem \
 pkgconf-pkg-config \
"
