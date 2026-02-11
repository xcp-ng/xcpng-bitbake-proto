
PN = "pappl-retrofit"
PE = "0"
PV = "1.0b2"
PR = "7.el10"
PACKAGES = "legacy-printer-app pappl-retrofit pappl-retrofit-devel"


URI_legacy-printer-app = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/legacy-printer-app-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:legacy-printer-app = "
 systemd
 cups-filesystem
 cups-libs
 authselect-libs
 bash
 libcupsfilters
 glibc
 pappl-retrofit
 libppd
"

URI_pappl-retrofit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pappl-retrofit-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl-retrofit = "
 cups-libs
 libcupsfilters
 glibc
 pappl
 libppd
"

URI_pappl-retrofit-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pappl-retrofit-devel-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl-retrofit-devel = "
 pappl-retrofit
 pkgconf-pkg-config
"
