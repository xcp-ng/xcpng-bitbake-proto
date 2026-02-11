
PN = "newt"
PE = "0"
PV = "0.52.24"
PR = "5.el10"
PACKAGES = "newt newt-devel python3-newt"


URI_newt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/newt-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:newt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libslang.so.2()(64bit) ( ) libslang.so.2(SLANG2)(64bit) ( )"
RPROVIDES:newt = "libnewt.so.0.52()(64bit) ( ) libnewt.so.0.52(NEWT_0.52)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.13)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.6)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.9)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.11)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.16)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.17)(64bit) ( ) newt ( =  0.52.24-5.el10) newt(x86-64) ( =  0.52.24-5.el10)"

URI_newt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/newt-devel-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:newt-devel = "/usr/bin/pkg-config ( ) libnewt.so.0.52()(64bit) ( ) slang-devel ( ) pkgconfig(slang) ( ) newt(x86-64) ( =  0.52.24-5.el10)"
RPROVIDES:newt-devel = "newt-devel ( =  0.52.24-5.el10) newt-devel(x86-64) ( =  0.52.24-5.el10) pkgconfig(libnewt) ( =  0.52.24)"

URI_python3-newt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-newt-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-newt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libnewt.so.0.52()(64bit) ( ) libnewt.so.0.52(NEWT_0.52)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.13)(64bit) ( ) libnewt.so.0.52(NEWT_0.52.6)(64bit) ( ) python(abi) ( =  3.12) newt(x86-64) ( =  0.52.24-5.el10)"
RPROVIDES:python3-newt = "newt-python3 ( =  0.52.24-5.el10) newt-python3(x86-64) ( =  0.52.24-5.el10) python-newt ( =  0.52.24-5.el10) python3-newt ( =  0.52.24-5.el10) python3-newt(x86-64) ( =  0.52.24-5.el10) python3.12-newt ( =  0.52.24-5.el10) snack ( =  0.52.24-5.el10)"
