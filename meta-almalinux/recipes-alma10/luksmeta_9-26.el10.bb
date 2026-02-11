
PN = "luksmeta"
PE = "0"
PV = "9"
PR = "26.el10"
PACKAGES = "libluksmeta luksmeta libluksmeta-devel"


URI_libluksmeta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libluksmeta-9-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libluksmeta = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( )"
RPROVIDES:libluksmeta = "libluksmeta.so.0()(64bit) ( ) libluksmeta(x86-64) ( =  9-26.el10) libluksmeta ( =  9-26.el10)"

URI_luksmeta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/luksmeta-9-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:luksmeta = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) libluksmeta.so.0()(64bit) ( ) libluksmeta(x86-64) ( =  9-26.el10)"
RPROVIDES:luksmeta = "luksmeta ( =  9-26.el10) luksmeta(x86-64) ( =  9-26.el10)"

URI_libluksmeta-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libluksmeta-devel-9-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libluksmeta-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(libcryptsetup) ( ) libluksmeta.so.0()(64bit) ( ) libluksmeta(x86-64) ( =  9-26.el10)"
RPROVIDES:libluksmeta-devel = "libluksmeta-devel ( =  9-26.el10) libluksmeta-devel(x86-64) ( =  9-26.el10) pkgconfig(luksmeta) ( =  9)"
