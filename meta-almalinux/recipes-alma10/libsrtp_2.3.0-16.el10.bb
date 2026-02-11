
PN = "libsrtp"
PE = "0"
PV = "2.3.0"
PR = "16.el10"
PACKAGES = "libsrtp libsrtp-devel libsrtp-tools"


URI_libsrtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsrtp-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp = "
 glibc
 nss
 nspr
"

URI_libsrtp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsrtp-devel-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp-devel = "
 libsrtp
 pkgconf-pkg-config
"

URI_libsrtp-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsrtp-tools-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp-tools = "
 glibc
 libsrtp
 libpcap
"
