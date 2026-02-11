
PN = "fstrm"
PE = "0"
PV = "0.6.1"
PR = "12.el10"
PACKAGES = "fstrm fstrm-devel fstrm-utils fstrm-doc"


URI_fstrm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fstrm-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm = " \
 glibc \
"

URI_fstrm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fstrm-devel-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm-devel = " \
 pkgconf-pkg-config \
 fstrm \
"

URI_fstrm-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fstrm-utils-0.6.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fstrm-utils = " \
 glibc \
 libevent \
 fstrm \
"

URI_fstrm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fstrm-doc-0.6.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:fstrm-doc = " \
 fstrm \
"
