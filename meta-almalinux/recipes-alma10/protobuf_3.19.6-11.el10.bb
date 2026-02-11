
PN = "protobuf"
PE = "0"
PV = "3.19.6"
PR = "11.el10"
PACKAGES = "protobuf protobuf-lite python3-protobuf protobuf-compiler protobuf-devel protobuf-lite-devel protobuf-emacs protobuf-vim"


URI_protobuf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/protobuf-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( )"
RPROVIDES:protobuf = "libprotobuf.so.30()(64bit) ( ) protobuf(x86-64) ( =  3.19.6-11.el10) protobuf ( =  3.19.6-11.el10)"

URI_protobuf-lite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/protobuf-lite-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-lite = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( )"
RPROVIDES:protobuf-lite = "libprotobuf-lite.so.30()(64bit) ( ) protobuf-lite ( =  3.19.6-11.el10) protobuf-lite(x86-64) ( =  3.19.6-11.el10)"

URI_python3-protobuf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-protobuf-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-protobuf = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libprotobuf.so.30()(64bit) ( ) python(abi) ( =  3.12) protobuf(x86-64) ( =  3.19.6-11.el10)"
RPROVIDES:python3-protobuf = "protobuf-python3 ( =  3.19.6-11.el10) python-protobuf ( =  3.19.6-11.el10) python3-protobuf ( =  3.19.6-11.el10) python3-protobuf(x86-64) ( =  3.19.6-11.el10) python3.12-protobuf ( =  3.19.6-11.el10) python3.12dist(protobuf) ( =  3.19.6) python3dist(protobuf) ( =  3.19.6)"

URI_protobuf-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-compiler-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-compiler = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libprotobuf.so.30()(64bit) ( ) protobuf ( =  3.19.6-11.el10)"
RPROVIDES:protobuf-compiler = "libprotoc.so.30()(64bit) ( ) protobuf-compiler ( =  3.19.6-11.el10) protobuf-compiler(x86-64) ( =  3.19.6-11.el10)"

URI_protobuf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-devel-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-devel = "/usr/bin/pkg-config ( ) zlib-devel ( ) libprotobuf.so.30()(64bit) ( ) libprotoc.so.30()(64bit) ( ) protobuf ( =  3.19.6-11.el10) protobuf-compiler ( =  3.19.6-11.el10)"
RPROVIDES:protobuf-devel = "protobuf-devel ( =  3.19.6-11.el10) pkgconfig(protobuf) ( =  3.19.6) protobuf-devel(x86-64) ( =  3.19.6-11.el10)"

URI_protobuf-lite-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-lite-devel-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-lite-devel = "/usr/bin/pkg-config ( ) libprotobuf-lite.so.30()(64bit) ( ) protobuf-devel ( =  3.19.6-11.el10) protobuf-lite ( =  3.19.6-11.el10)"
RPROVIDES:protobuf-lite-devel = "pkgconfig(protobuf-lite) ( =  3.19.6) protobuf-lite-devel ( =  3.19.6-11.el10) protobuf-lite-devel(x86-64) ( =  3.19.6-11.el10)"

URI_protobuf-emacs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/protobuf-emacs-3.19.6-11.el10.noarch.rpm;unpack=0"
RDEPENDS:protobuf-emacs = "emacs-filesystem ( >=  29.4)"
RPROVIDES:protobuf-emacs = "protobuf-emacs ( =  3.19.6-11.el10)"

URI_protobuf-vim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/protobuf-vim-3.19.6-11.el10.noarch.rpm;unpack=0"
RDEPENDS:protobuf-vim = "vim-filesystem ( )"
RPROVIDES:protobuf-vim = "protobuf-vim ( =  3.19.6-11.el10)"
