
PN = "sanlock"
PE = "0"
PV = "3.9.5"
PR = "4.el10"
PACKAGES = "sanlock sanlock-lib sanlock-devel"


URI_sanlock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock = " \
 libuuid \
 systemd \
 libaio \
 sanlock-lib \
 libblkid \
 bash \
 glibc \
"

URI_sanlock-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-lib-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock-lib = " \
 glibc \
 libaio \
 libblkid \
"

URI_sanlock-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sanlock-devel-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sanlock-devel = " \
 pkgconf-pkg-config \
 sanlock-lib \
"
