
PN = "efivar"
PE = "0"
PV = "39"
PR = "3.el10"
PACKAGES = "efivar-libs efivar efivar-devel"


URI_efivar-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efivar-libs-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:efivar-libs = "libefivar.so.1()(64bit) ( ) libefivar.so.1(LIBEFIVAR_0.24)(64bit) ( ) libefivar.so.1(libefivar.so.0)(64bit) ( ) libefiboot.so.1()(64bit) ( ) libefiboot.so.1(libefiboot.so.0)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.30)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.36)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_0.0)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_0.24)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_1.28)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_1.29)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_1.30)(64bit) ( ) libefiboot.so.1(LIBEFIBOOT_1.31)(64bit) ( ) libefisec.so.1()(64bit) ( ) libefisec.so.1(LIBEFISEC_1.38)(64bit) ( ) libefisec.so.1(libefisec.so.0)(64bit) ( ) libefivar.so.1(LIBEFIVAR_0.0)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.28)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.29)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.33)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.35)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.37)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.38)(64bit) ( ) efivar-libs ( =  39-3.el10) efivar-libs(x86-64) ( =  39-3.el10)"

URI_efivar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/efivar-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libefivar.so.1()(64bit) ( ) libefivar.so.1(libefivar.so.0)(64bit) ( ) libefisec.so.1()(64bit) ( ) libefisec.so.1(LIBEFISEC_1.38)(64bit) ( ) libefivar.so.1(LIBEFIVAR_0.24)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.30)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.36)(64bit) ( ) libefivar.so.1(LIBEFIVAR_1.38)(64bit) ( ) efivar-libs ( =  39-3.el10)"
RPROVIDES:efivar = "efivar ( =  39-3.el10) efivar(x86-64) ( =  39-3.el10)"

URI_efivar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/efivar-devel-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar-devel = "/usr/bin/pkg-config ( ) pkgconfig(efivar) ( ) libefiboot.so.1()(64bit) ( ) libefisec.so.1()(64bit) ( ) libefivar.so.1()(64bit) ( ) efivar-libs ( =  39-3.el10)"
RPROVIDES:efivar-devel = "efivar-devel ( =  39-3.el10) efivar-devel(x86-64) ( =  39-3.el10) pkgconfig(efiboot) ( =  39) pkgconfig(efisec) ( =  39) pkgconfig(efivar) ( =  39)"
