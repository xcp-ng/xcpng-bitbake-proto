
PN = "pam"
PE = "0"
PV = "1.6.1"
PR = "7.el10"
PACKAGES = "pam pam-libs pam-devel pam-doc"


URI_pam = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pam-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam = " \
 setup \
 libxcrypt \
 audit-libs \
 openssl-libs \
 gdbm \
 gdbm-libs \
 libpwquality \
 authselect \
 pam-libs \
 bash \
 glibc \
 libselinux \
 libeconf \
"

URI_pam-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pam-libs-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam-libs = " \
 glibc \
 audit-libs \
 libeconf \
"

URI_pam-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pam-devel-1.6.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam-devel = " \
 pam-libs \
 pkgconf-pkg-config \
"

URI_pam-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pam-doc-1.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:pam-doc = " \
 pam \
"
