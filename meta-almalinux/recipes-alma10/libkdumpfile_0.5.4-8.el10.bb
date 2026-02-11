
PN = "libkdumpfile"
PE = "0"
PV = "0.5.4"
PR = "8.el10"
PACKAGES = "libkdumpfile libkdumpfile-devel libkdumpfile-doc libkdumpfile-util python3-libkdumpfile"


URI_libkdumpfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libkdumpfile-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkdumpfile = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) liblzo2.so.2()(64bit) ( ) libsnappy.so.1()(64bit) ( )"
RPROVIDES:libkdumpfile = "libkdumpfile.so.10()(64bit) ( ) libaddrxlat.so.3()(64bit) ( ) libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) ( ) libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) ( ) libkdumpfile(x86-64) ( =  0.5.4-8.el10) libkdumpfile ( =  0.5.4-8.el10)"

URI_libkdumpfile-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libkdumpfile-devel-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkdumpfile-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) pkgconfig(libzstd) ( ) libkdumpfile.so.10()(64bit) ( ) libaddrxlat.so.3()(64bit) ( ) pkgconfig(libaddrxlat) ( ) pkgconfig(lzo2) ( ) pkgconfig(snappy) ( ) libkdumpfile(x86-64) ( =  0.5.4-8.el10)"
RPROVIDES:libkdumpfile-devel = "libkdumpfile-devel ( =  0.5.4-8.el10) libkdumpfile-devel(x86-64) ( =  0.5.4-8.el10) pkgconfig(libaddrxlat) ( =  0.5.4) pkgconfig(libkdumpfile) ( =  0.5.4)"

URI_libkdumpfile-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkdumpfile-doc-0.5.4-8.el10.noarch.rpm;unpack=0"
RDEPENDS:libkdumpfile-doc = ""
RPROVIDES:libkdumpfile-doc = "libkdumpfile-doc ( =  0.5.4-8.el10)"

URI_libkdumpfile-util = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libkdumpfile-util-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkdumpfile-util = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libaddrxlat.so.3()(64bit) ( ) libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) ( ) libkdumpfile.so.10()(64bit) ( ) libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) ( ) libkdumpfile(x86-64) ( =  0.5.4-8.el10)"
RPROVIDES:libkdumpfile-util = "libkdumpfile-util ( =  0.5.4-8.el10) libkdumpfile-util(x86-64) ( =  0.5.4-8.el10)"

URI_python3-libkdumpfile = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libkdumpfile-0.5.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libkdumpfile = "rtld(GNU_HASH) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libzstd.so.1()(64bit) ( ) libaddrxlat.so.3()(64bit) ( ) libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) ( ) libkdumpfile.so.10()(64bit) ( ) libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) ( ) liblzo2.so.2()(64bit) ( ) libsnappy.so.1()(64bit) ( ) python(abi) ( =  3.12) libkdumpfile(x86-64) ( =  0.5.4-8.el10)"
RPROVIDES:python3-libkdumpfile = "libkdumpfile-python ( =  0.5.4-8.el10) libkdumpfile-python(x86-64) ( =  0.5.4-8.el10) python-libkdumpfile ( =  0.5.4-8.el10) python3-libkdumpfile ( =  0.5.4-8.el10) python3-libkdumpfile(x86-64) ( =  0.5.4-8.el10) python3.12-libkdumpfile ( =  0.5.4-8.el10) python3.12dist(libkdumpfile) ( =  0.5.4) python3dist(libkdumpfile) ( =  0.5.4)"
