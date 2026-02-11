
PN = "irssi"
PE = "0"
PV = "1.4.5"
PR = "6.el10"
PACKAGES = "irssi irssi-devel"


URI_irssi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/irssi-1.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:irssi = "
 perl-libs
 perl-Carp
 perl-vars
 libxcrypt
 openssl-libs
 utf8proc
 perl-DynaLoader
 perl-Symbol
 ncurses-libs
 glib2
 glibc
 perl-Exporter
 perl-lib
"

URI_irssi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/irssi-devel-1.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:irssi-devel = "
 glib2-devel
 pkgconf-pkg-config
 irssi
"
