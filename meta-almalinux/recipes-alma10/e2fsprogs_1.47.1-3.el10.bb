
PN = "e2fsprogs"
PE = "0"
PV = "1.47.1"
PR = "3.el10"
PACKAGES = "e2fsprogs e2fsprogs-libs libcom_err libss e2fsprogs-devel libcom_err-devel e2fsprogs-static e2scrub libss-devel"


URI_e2fsprogs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/e2fsprogs-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs = " \
 libuuid \
 e2fsprogs-libs \
 libss \
 fuse3-libs \
 libblkid \
 libcom_err \
 glibc \
"

URI_e2fsprogs-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/e2fsprogs-libs-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-libs = " \
 glibc \
 libcom_err \
"

URI_libcom_err = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcom_err-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcom_err = " \
 glibc \
"

URI_libss = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libss-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libss = " \
 glibc \
 libcom_err \
"

URI_e2fsprogs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/e2fsprogs-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-devel = " \
 e2fsprogs-libs \
 gawk \
 pkgconf-pkg-config \
 libcom_err-devel \
"

URI_libcom_err-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcom_err-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcom_err-devel = " \
 libcom_err \
 bash \
 pkgconf-pkg-config \
"

URI_e2fsprogs-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/e2fsprogs-static-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-static = ""

URI_e2scrub = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/e2scrub-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2scrub = " \
 e2fsprogs \
 systemd \
 lvm2 \
 util-linux \
 bash \
"

URI_libss-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libss-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libss-devel = " \
 libss \
 bash \
 pkgconf-pkg-config \
 libcom_err-devel \
"
