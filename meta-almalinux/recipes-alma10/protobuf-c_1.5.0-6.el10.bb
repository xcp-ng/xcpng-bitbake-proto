
PN = "protobuf-c"
PE = "0"
PV = "1.5.0"
PR = "6.el10"
PACKAGES = "protobuf-c protobuf-c-compiler protobuf-c-devel"


URI_protobuf-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/protobuf-c-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:protobuf-c = "libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.3.0)(64bit) ( ) protobuf-c ( =  1.5.0-6.el10) protobuf-c(x86-64) ( =  1.5.0-6.el10)"

URI_protobuf-c-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-c-compiler-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-c-compiler = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libprotobuf.so.30()(64bit) ( ) libprotoc.so.30()(64bit) ( ) protobuf-c(x86-64) ( =  1.5.0-6.el10)"
RPROVIDES:protobuf-c-compiler = "protobuf-c-compiler(x86-64) ( =  1.5.0-6.el10) protobuf-c-compiler ( =  1.5.0-6.el10)"

URI_protobuf-c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-c-devel-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-c-devel = "/usr/bin/pkg-config ( ) libprotobuf-c.so.1()(64bit) ( ) protobuf-c(x86-64) ( =  1.5.0-6.el10) protobuf-c-compiler(x86-64) ( =  1.5.0-6.el10)"
RPROVIDES:protobuf-c-devel = "pkgconfig(libprotobuf-c) ( =  1.5.0) protobuf-c-devel ( =  1.5.0-6.el10) protobuf-c-devel(x86-64) ( =  1.5.0-6.el10)"
