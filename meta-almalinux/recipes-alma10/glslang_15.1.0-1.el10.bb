
PN = "glslang"
PE = "0"
PV = "15.1.0"
PR = "1.el10"
PACKAGES = "glslang glslang-devel"


URI_glslang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glslang-15.1.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glslang = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( )"
RPROVIDES:glslang = "glslang ( =  15.1.0-1.el10) glslang(x86-64) ( =  15.1.0-1.el10)"

URI_glslang-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glslang-devel-15.1.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glslang-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) glslang(x86-64) ( =  15.1.0-1.el10)"
RPROVIDES:glslang-devel = "pkgconfig(glslang) ( ) cmake(glslang) ( =  15.1.0) glslang-devel ( =  15.1.0-1.el10) glslang-devel(x86-64) ( =  15.1.0-1.el10) pkgconfig(spirv) ( =  1.5.5)"
