
PN = "dotnet8.0"
PE = "0"
PV = "8.0.121"
PR = "1.el10_0"
PACKAGES = "aspnetcore-runtime-8.0 aspnetcore-runtime-dbg-8.0 aspnetcore-targeting-pack-8.0 dotnet-apphost-pack-8.0 dotnet-hostfxr-8.0 dotnet-runtime-8.0 dotnet-runtime-dbg-8.0 dotnet-sdk-8.0 dotnet-sdk-dbg-8.0 dotnet-targeting-pack-8.0 dotnet-templates-8.0 dotnet-sdk-8.0-source-built-artifacts"


URI_aspnetcore-runtime-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-runtime-8.0 = "dotnet-runtime-8.0(x86-64) ( =  8.0.21-1.el10_0)"
RPROVIDES:aspnetcore-runtime-8.0 = "aspnetcore-runtime-8.0(x86-64) ( =  8.0.21-1.el10_0) aspnetcore-runtime-8.0 ( =  8.0.21-1.el10_0)"

URI_aspnetcore-runtime-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-dbg-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-runtime-dbg-8.0 = "aspnetcore-runtime-8.0(x86-64) ( =  8.0.21-1.el10_0)"
RPROVIDES:aspnetcore-runtime-dbg-8.0 = "aspnetcore-runtime-dbg-8.0 ( =  8.0.21-1.el10_0) aspnetcore-runtime-dbg-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_aspnetcore-targeting-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-targeting-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-targeting-pack-8.0 = "dotnet-host(x86-64) ( )"
RPROVIDES:aspnetcore-targeting-pack-8.0 = "aspnetcore-targeting-pack-8.0 ( =  8.0.21-1.el10_0) aspnetcore-targeting-pack-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_dotnet-apphost-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-apphost-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-apphost-pack-8.0 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libssl.so.3()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) dotnet-host(x86-64) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( )"
RPROVIDES:dotnet-apphost-pack-8.0 = "dotnet-apphost-pack-8.0 ( =  8.0.21-1.el10_0) dotnet-apphost-pack-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_dotnet-hostfxr-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-hostfxr-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-hostfxr-8.0 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) dotnet-host(x86-64) ( >=  8.0.21-1.el10_0)"
RPROVIDES:dotnet-hostfxr-8.0 = "dotnet-hostfxr-8.0 ( =  8.0.21-1.el10_0) dotnet-hostfxr-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_dotnet-runtime-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-runtime-8.0 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libssl.so.3()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libicu(x86-64) ( ) dotnet-hostfxr-8.0(x86-64) ( >=  8.0.21-1.el10_0)"
RPROVIDES:dotnet-runtime-8.0 = "bundled(libbrotli) ( =  1.0.9) bundled(libunwind) ( =  1.5.rc1.28.g9165d2a1) dotnet-runtime-8.0(x86-64) ( =  8.0.21-1.el10_0) dotnet-runtime-8.0 ( =  8.0.21-1.el10_0)"

URI_dotnet-runtime-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-dbg-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-runtime-dbg-8.0 = "dotnet-runtime-8.0(x86-64) ( =  8.0.21-1.el10_0)"
RPROVIDES:dotnet-runtime-dbg-8.0 = "dotnet-runtime-dbg-8.0 ( =  8.0.21-1.el10_0) dotnet-runtime-dbg-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_dotnet-sdk-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-8.0 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) aspnetcore-runtime-8.0(x86-64) ( >=  8.0.21-1.el10_0) aspnetcore-targeting-pack-8.0(x86-64) ( >=  8.0.21-1.el10_0) dotnet-apphost-pack-8.0(x86-64) ( >=  8.0.21-1.el10_0) dotnet-runtime-8.0(x86-64) ( >=  8.0.21-1.el10_0) dotnet-targeting-pack-8.0(x86-64) ( >=  8.0.21-1.el10_0) dotnet-templates-8.0(x86-64) ( >=  8.0.121-1.el10_0) netstandard-targeting-pack-2.1(x86-64) ( >=  8.0.121-1.el10_0)"
RPROVIDES:dotnet-sdk-8.0 = "bundled(js-jquery) ( ) dotnet-sdk-8.0(x86-64) ( =  8.0.121-1.el10_0) dotnet-sdk-8.0 ( =  8.0.121-1.el10_0)"

URI_dotnet-sdk-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-dbg-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-dbg-8.0 = "dotnet-sdk-8.0(x86-64) ( =  8.0.121-1.el10_0)"
RPROVIDES:dotnet-sdk-dbg-8.0 = "dotnet-sdk-dbg-8.0 ( =  8.0.121-1.el10_0) dotnet-sdk-dbg-8.0(x86-64) ( =  8.0.121-1.el10_0)"

URI_dotnet-targeting-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-targeting-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-targeting-pack-8.0 = "dotnet-host(x86-64) ( )"
RPROVIDES:dotnet-targeting-pack-8.0 = "dotnet-targeting-pack-8.0 ( =  8.0.21-1.el10_0) dotnet-targeting-pack-8.0(x86-64) ( =  8.0.21-1.el10_0)"

URI_dotnet-templates-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-templates-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-templates-8.0 = "dotnet-host(x86-64) ( >=  8.0.21-1.el10_0)"
RPROVIDES:dotnet-templates-8.0 = "dotnet-templates-8.0 ( =  8.0.121-1.el10_0) dotnet-templates-8.0(x86-64) ( =  8.0.121-1.el10_0)"

URI_dotnet-sdk-8.0-source-built-artifacts = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dotnet-sdk-8.0-source-built-artifacts-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-8.0-source-built-artifacts = ""
RPROVIDES:dotnet-sdk-8.0-source-built-artifacts = "dotnet-sdk-8.0-source-built-artifacts ( =  8.0.121-1.el10_0) dotnet-sdk-8.0-source-built-artifacts(x86-64) ( =  8.0.121-1.el10_0)"
