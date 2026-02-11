
PN = "libijs"
PE = "0"
PV = "0.35"
PR = "24.el10"
PACKAGES = "libijs libijs-devel libijs-doc"


URI_libijs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libijs-0.35-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libijs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libijs = "libijs-0.35.so()(64bit) ( ) libijs ( =  0.35-24.el10) libijs(x86-64) ( =  0.35-24.el10)"

URI_libijs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libijs-devel-0.35-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libijs-devel = "/usr/bin/pkg-config ( ) libijs(x86-64) ( =  0.35-24.el10)"
RPROVIDES:libijs-devel = "libijs-devel ( =  0.35-24.el10) libijs-devel(x86-64) ( =  0.35-24.el10) pkgconfig(ijs) ( =  0.35)"

URI_libijs-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libijs-doc-0.35-24.el10.noarch.rpm;unpack=0"
RDEPENDS:libijs-doc = "libijs ( =  0.35-24.el10)"
RPROVIDES:libijs-doc = "libijs-doc ( =  0.35-24.el10)"
