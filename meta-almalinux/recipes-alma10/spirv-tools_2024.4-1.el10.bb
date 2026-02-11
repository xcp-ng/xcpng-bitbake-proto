
PN = "spirv-tools"
PE = "0"
PV = "2024.4"
PR = "1.el10"
PACKAGES = "spirv-tools spirv-tools-libs spirv-tools-devel"


URI_spirv-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spirv-tools-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( ) libSPIRV-Tools-link.so()(64bit) ( ) libSPIRV-Tools-lint.so()(64bit) ( ) libSPIRV-Tools-reduce.so()(64bit) ( ) spirv-tools-libs(x86-64) ( =  2024.4-1.el10)"
RPROVIDES:spirv-tools = "spirv-tools ( =  2024.4-1.el10) spirv-tools(x86-64) ( =  2024.4-1.el10)"

URI_spirv-tools-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spirv-tools-libs-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( )"
RPROVIDES:spirv-tools-libs = "libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( ) libSPIRV-Tools-link.so()(64bit) ( ) libSPIRV-Tools-lint.so()(64bit) ( ) libSPIRV-Tools-reduce.so()(64bit) ( ) libSPIRV-Tools-diff.so()(64bit) ( ) libSPIRV-Tools-shared.so()(64bit) ( ) spirv-tools-libs(x86-64) ( =  2024.4-1.el10) spirv-tools-libs ( =  2024.4-1.el10) spirv-tools-libs(x86-64) ( =  2024.4)"

URI_spirv-tools-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/spirv-tools-devel-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) spirv-tools-libs(x86-64) ( =  2024.4-1.el10)"
RPROVIDES:spirv-tools-devel = "cmake(SPIRV-Tools) ( ) cmake(SPIRV-Tools-diff) ( ) cmake(SPIRV-Tools-link) ( ) cmake(SPIRV-Tools-lint) ( ) cmake(SPIRV-Tools-opt) ( ) cmake(SPIRV-Tools-reduce) ( ) cmake(SPIRV-Tools-tools) ( ) cmake(spirv-tools) ( ) cmake(spirv-tools-diff) ( ) cmake(spirv-tools-link) ( ) cmake(spirv-tools-lint) ( ) cmake(spirv-tools-opt) ( ) cmake(spirv-tools-reduce) ( ) cmake(spirv-tools-tools) ( ) pkgconfig(SPIRV-Tools) ( =  2024.4.1) pkgconfig(SPIRV-Tools-shared) ( =  2024.4.1) spirv-tools-devel ( =  2024.4-1.el10) spirv-tools-devel(x86-64) ( =  2024.4-1.el10)"
