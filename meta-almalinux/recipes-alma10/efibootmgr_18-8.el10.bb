
PN = "efibootmgr"
PE = "0"
PV = "18"
PR = "8.el10"
PACKAGES = "efibootmgr"


URI_efibootmgr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efibootmgr-18-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efibootmgr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) efi-filesystem ( ) libefivar.so.1()(64bit) ( ) libefivar.so.1(LIBEFIVAR_0.24)(64bit) ( ) libefivar.so.1(libefivar.so.0)(64bit) ( ) libefiboot.so.1()(64bit) ( ) libefiboot.so.1(libefiboot.so.0)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.30)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.36)(64bit) ( )"
RPROVIDES:efibootmgr = "efibootmgr ( =  18-8.el10) efibootmgr(x86-64) ( =  18-8.el10)"
