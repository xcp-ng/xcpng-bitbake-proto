
PN = "slang"
PE = "0"
PV = "2.3.3"
PR = "8.el10"
PACKAGES = "slang slang-devel slang-slsh"


URI_slang = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/slang-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:slang = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( )"
RPROVIDES:slang = "libslang.so.2()(64bit) ( ) libslang.so.2(SLANG2)(64bit) ( ) libslang.so.2(SLANG2.1.0)(64bit) ( ) libslang.so.2(SLANG2.1.1)(64bit) ( ) libslang.so.2(SLANG2.2.0)(64bit) ( ) libslang.so.2(SLANG2.2.1)(64bit) ( ) libslang.so.2(SLANG2.2.3)(64bit) ( ) libslang.so.2(SLANG2.3.0)(64bit) ( ) slang ( =  2.3.3-8.el10) slang(x86-64) ( =  2.3.3-8.el10)"

URI_slang-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slang-devel-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:slang-devel = "/usr/bin/pkg-config ( ) libslang.so.2()(64bit) ( ) slang(x86-64) ( =  2.3.3-8.el10)"
RPROVIDES:slang-devel = "pkgconfig(slang) ( =  2.3.3) slang-devel ( =  2.3.3-8.el10) slang-devel(x86-64) ( =  2.3.3-8.el10)"

URI_slang-slsh = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/slang-slsh-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:slang-slsh = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libslang.so.2()(64bit) ( ) libslang.so.2(SLANG2)(64bit) ( ) libslang.so.2(SLANG2.1.0)(64bit) ( ) libslang.so.2(SLANG2.3.0)(64bit) ( ) slang(x86-64) ( =  2.3.3-8.el10)"
RPROVIDES:slang-slsh = "config(slang-slsh) ( =  2.3.3-8.el10) slang-slsh ( =  2.3.3-8.el10) slang-slsh(x86-64) ( =  2.3.3-8.el10)"
