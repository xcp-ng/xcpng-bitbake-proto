
PN = "annobin"
PE = "0"
PV = "12.92"
PR = "1.el10"
PACKAGES = "annobin-annocheck annobin-docs annobin-libannocheck annobin-plugin-clang annobin-plugin-gcc annobin-plugin-llvm"


URI_annobin-annocheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-annocheck-12.92-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:annobin-annocheck = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libdw.so.1(ELFUTILS_0.130)(64bit) ( ) libdw.so.1(ELFUTILS_0.126)(64bit) ( ) libdw.so.1(ELFUTILS_0.156)(64bit) ( ) librpm.so.10()(64bit) ( ) rpm ( ) cpio ( ) libdw.so.1(ELFUTILS_0.159)(64bit) ( ) annobin-docs ( =  12.92-1.el10)"
RPROVIDES:annobin-annocheck = "annobin-annocheck ( =  12.92-1.el10) annobin-annocheck(x86-64) ( =  12.92-1.el10)"

URI_annobin-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-docs-12.92-1.el10.noarch.rpm;unpack=0"
RDEPENDS:annobin-docs = ""
RPROVIDES:annobin-docs = "annobin-docs ( =  12.92-1.el10)"

URI_annobin-libannocheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-libannocheck-12.92-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:annobin-libannocheck = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/pkg-config ( ) annobin-docs ( =  12.92-1.el10)"
RPROVIDES:annobin-libannocheck = "libannocheck.so.0()(64bit) ( ) annobin-libannocheck ( =  12.92-1.el10) annobin-libannocheck(x86-64) ( =  12.92-1.el10) pkgconfig(libannocheck) ( =  12.92)"

URI_annobin-plugin-clang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-clang-12.92-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:annobin-plugin-clang = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) llvm-libs ( ) annobin-docs ( =  12.92-1.el10)"
RPROVIDES:annobin-plugin-clang = "annobin-plugin-clang ( =  12.92-1.el10) annobin-plugin-clang(x86-64) ( =  12.92-1.el10)"

URI_annobin-plugin-gcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-gcc-12.92-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:annobin-plugin-gcc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libstdc++.so.6()(64bit) ( ) gcc ( ) annobin-docs ( =  12.92-1.el10)"
RPROVIDES:annobin-plugin-gcc = "annobin-plugin-gcc ( =  12.92-1.el10) annobin-plugin-gcc(x86-64) ( =  12.92-1.el10)"

URI_annobin-plugin-llvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/annobin-plugin-llvm-12.92-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:annobin-plugin-llvm = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) llvm-libs ( ) annobin-docs ( =  12.92-1.el10)"
RPROVIDES:annobin-plugin-llvm = "annobin-plugin-llvm ( =  12.92-1.el10) annobin-plugin-llvm(x86-64) ( =  12.92-1.el10)"
