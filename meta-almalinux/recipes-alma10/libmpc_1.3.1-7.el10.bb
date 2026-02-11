
PN = "libmpc"
PE = "0"
PV = "1.3.1"
PR = "7.el10"
PACKAGES = "libmpc libmpc-devel libmpc-doc"


URI_libmpc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpc-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpc = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( )"
RPROVIDES:libmpc = "libmpc.so.3()(64bit) ( ) libmpc(x86-64) ( =  1.3.1-7.el10) compat-libmpc ( =  1.3.1-7.el10) libmpc ( =  1.3.1-7.el10)"

URI_libmpc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpc-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpc-devel = "libmpc.so.3()(64bit) ( ) gmp-devel(x86-64) ( ) mpfr-devel(x86-64) ( ) libmpc(x86-64) ( =  1.3.1-7.el10)"
RPROVIDES:libmpc-devel = "libmpc-devel ( =  1.3.1-7.el10) libmpc-devel(x86-64) ( =  1.3.1-7.el10)"

URI_libmpc-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmpc-doc-1.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:libmpc-doc = ""
RPROVIDES:libmpc-doc = "libmpc-doc ( =  1.3.1-7.el10)"
