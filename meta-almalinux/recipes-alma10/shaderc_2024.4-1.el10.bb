
PN = "shaderc"
PE = "0"
PV = "2024.4"
PR = "1.el10"
PACKAGES = "glslc libshaderc libshaderc-devel libshaderc-static"


URI_glslc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glslc-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glslc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( )"
RPROVIDES:glslc = "glslc ( =  2024.4-1.el10) glslc(x86-64) ( =  2024.4-1.el10)"

URI_libshaderc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libshaderc-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( )"
RPROVIDES:libshaderc = "libshaderc_shared.so.1()(64bit) ( ) libshaderc ( =  2024.4-1.el10) libshaderc(x86-64) ( =  2024.4-1.el10)"

URI_libshaderc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libshaderc-devel-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc-devel = "/usr/bin/pkg-config ( ) libshaderc_shared.so.1()(64bit) ( ) libshaderc(x86-64) ( =  2024.4-1.el10)"
RPROVIDES:libshaderc-devel = "libshaderc-devel ( =  2024.4-1.el10) libshaderc-devel(x86-64) ( =  2024.4-1.el10) pkgconfig(shaderc) ( =  2023.8.1)"

URI_libshaderc-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libshaderc-static-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc-static = "/usr/bin/pkg-config ( )"
RPROVIDES:libshaderc-static = "libshaderc-static ( =  2024.4-1.el10) libshaderc-static(x86-64) ( =  2024.4-1.el10) pkgconfig(shaderc_combined) ( =  2023.8.1) pkgconfig(shaderc_static) ( =  2023.8.1)"
