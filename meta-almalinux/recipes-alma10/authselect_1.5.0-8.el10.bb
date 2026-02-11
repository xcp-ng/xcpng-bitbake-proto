
PN = "authselect"
PE = "0"
PV = "1.5.0"
PR = "8.el10"
PACKAGES = "authselect authselect-libs authselect-devel"


URI_authselect = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/authselect-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect = "
 glibc
 authselect-libs
 bash
 popt
"

URI_authselect-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/authselect-libs-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect-libs = "
 libselinux
 bash
 glibc
 coreutils
 sed
"

URI_authselect-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/authselect-devel-1.5.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:authselect-devel = "
 authselect-libs
 pkgconf-pkg-config
"
