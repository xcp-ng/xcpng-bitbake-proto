
PN = "libbytesize"
PE = "0"
PV = "2.10"
PR = "5.el10"
PACKAGES = "libbytesize python3-bytesize libbytesize-devel libbytesize-tools"


URI_libbytesize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbytesize-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( )"
RPROVIDES:libbytesize = "libbytesize.so.1()(64bit) ( ) libbytesize(x86-64) ( =  2.10-5.el10) libbytesize ( =  2.10-5.el10)"

URI_python3-bytesize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-bytesize-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-bytesize = "python(abi) ( =  3.12) libbytesize(x86-64) ( =  2.10-5.el10)"
RPROVIDES:python3-bytesize = "python-bytesize ( =  2.10-5.el10) python3-bytesize ( =  2.10-5.el10) python3-bytesize(x86-64) ( =  2.10-5.el10) python3.12-bytesize ( =  2.10-5.el10)"

URI_libbytesize-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbytesize-devel-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize-devel = "/usr/bin/pkg-config ( ) libbytesize.so.1()(64bit) ( ) libbytesize(x86-64) ( =  2.10-5.el10)"
RPROVIDES:libbytesize-devel = "libbytesize-devel ( =  2.10-5.el10) libbytesize-devel(x86-64) ( =  2.10-5.el10) pkgconfig(bytesize) ( =  2.10)"

URI_libbytesize-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libbytesize-tools-2.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbytesize-tools = "/usr/bin/python3 ( ) python3-bytesize ( =  2.10-5.el10)"
RPROVIDES:libbytesize-tools = "libbytesize-tools ( =  2.10-5.el10) libbytesize-tools(x86-64) ( =  2.10-5.el10)"
