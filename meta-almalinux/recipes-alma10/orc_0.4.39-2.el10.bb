
PN = "orc"
PE = "0"
PV = "0.4.39"
PR = "2.el10"
PACKAGES = "orc orc-compiler orc-devel orc-doc"


URI_orc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:orc = "liborc-0.4.so.0()(64bit) ( ) liborc-test-0.4.so.0()(64bit) ( ) orc ( =  0.4.39-2.el10) orc(x86-64) ( =  0.4.39-2.el10)"

URI_orc-compiler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-compiler-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc-compiler = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) pkgconfig ( ) liborc-0.4.so.0()(64bit) ( ) orc ( =  0.4.39-2.el10)"
RPROVIDES:orc-compiler = "orc-compiler ( =  0.4.39-2.el10) orc-compiler(x86-64) ( =  0.4.39-2.el10)"

URI_orc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orc-devel-0.4.39-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:orc-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) liborc-0.4.so.0()(64bit) ( ) orc-compiler ( ) orc ( =  0.4.39-2.el10)"
RPROVIDES:orc-devel = "orc-devel ( =  0.4.39-2.el10) orc-devel(x86-64) ( =  0.4.39-2.el10) pkgconfig(orc-0.4) ( =  0.4.39) pkgconfig(orc-test-0.4) ( =  0.4.39)"

URI_orc-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/orc-doc-0.4.39-2.el10.noarch.rpm;unpack=0"
RDEPENDS:orc-doc = "orc ( =  0.4.39-2.el10)"
RPROVIDES:orc-doc = "orc-doc ( =  0.4.39-2.el10)"
