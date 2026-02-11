
PN = "pappl-retrofit"
PE = "0"
PV = "1.0b2"
PR = "7.el10"
PACKAGES = "legacy-printer-app pappl-retrofit pappl-retrofit-devel"


URI_legacy-printer-app = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/legacy-printer-app-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:legacy-printer-app = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcups.so.2()(64bit) ( ) cups-filesystem ( ) libcupsfilters.so.2()(64bit) ( ) libppd.so.2()(64bit) ( ) libpappl-retrofit.so.1()(64bit) ( ) authselect-libs ( ) pappl-retrofit(x86-64) ( =  1.0b2-7.el10)"
RPROVIDES:legacy-printer-app = "/usr/bin/legacy-printer-app ( ) config(legacy-printer-app) ( =  1.0b2-7.el10) legacy-printer-app ( =  1.0b2-7.el10) legacy-printer-app(x86-64) ( =  1.0b2-7.el10)"

URI_pappl-retrofit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pappl-retrofit-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl-retrofit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcups.so.2()(64bit) ( ) libcupsfilters.so.2()(64bit) ( ) libppd.so.2()(64bit) ( ) libpappl.so.1()(64bit) ( )"
RPROVIDES:pappl-retrofit = "libpappl-retrofit.so.1()(64bit) ( ) pappl-retrofit(x86-64) ( =  1.0b2-7.el10) pappl-retrofit ( =  1.0b2-7.el10)"

URI_pappl-retrofit-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pappl-retrofit-devel-1.0b2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl-retrofit-devel = "/usr/bin/pkg-config ( ) libpappl-retrofit.so.1()(64bit) ( ) pappl-retrofit(x86-64) ( =  1.0b2-7.el10)"
RPROVIDES:pappl-retrofit-devel = "pappl-retrofit-devel ( =  1.0b2-7.el10) pappl-retrofit-devel(x86-64) ( =  1.0b2-7.el10) pkgconfig(libpappl-retrofit) ( =  1.0b2)"
