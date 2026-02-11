
PN = "libsemanage"
PE = "0"
PV = "3.8.1"
PR = "1.el10_0"
PACKAGES = "libsemanage python3-libsemanage libsemanage-devel libsemanage-static"


URI_libsemanage = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsemanage-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage = " \
 bzip2-libs \
 audit-libs \
 glibc \
 libselinux \
 libsepol \
"

URI_python3-libsemanage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libsemanage-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libsemanage = " \
 glibc \
 libsemanage \
 python3 \
 python3-libselinux \
"

URI_libsemanage-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsemanage-devel-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage-devel = " \
 libsemanage \
 libselinux-devel \
 pkgconf-pkg-config \
 libsepol-devel \
"

URI_libsemanage-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsemanage-static-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage-static = " \
 libsemanage-devel \
"
