
PN = "pam_wrapper"
PE = "0"
PV = "1.1.4"
PR = "14.el10"
PACKAGES = "pam_wrapper libpamtest libpamtest-devel libpamtest-doc python3-libpamtest"


URI_pam_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pam_wrapper-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam_wrapper = " \
 glibc \
 pam-libs \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_libpamtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest = " \
 glibc \
 pam-libs \
 pam_wrapper \
"

URI_libpamtest-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-devel-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest-devel = " \
 libpamtest \
 pam_wrapper \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_libpamtest-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-doc-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest-doc = ""

URI_python3-libpamtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libpamtest-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libpamtest = " \
 python3 \
 pam_wrapper \
 python3-libs \
 libpamtest \
 glibc \
"
