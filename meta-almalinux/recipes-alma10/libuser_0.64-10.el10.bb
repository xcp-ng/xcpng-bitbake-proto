
PN = "libuser"
PE = "0"
PV = "0.64"
PR = "10.el10"
PACKAGES = "libuser libuser-devel python3-libuser"


URI_libuser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libuser-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuser = " \
 libxcrypt \
 audit-libs \
 pam-libs \
 popt \
 glib2 \
 glibc \
 libselinux \
 openldap \
"

URI_libuser-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libuser-devel-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuser-devel = " \
 libuser \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_python3-libuser = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libuser-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libuser = " \
 libuser \
 python3 \
 libxcrypt \
 audit-libs \
 glib2 \
 glibc \
 libselinux \
"
