
PN = "dotnet9.0"
PE = "0"
PV = "9.0.111"
PR = "1.el10_0"
PACKAGES = "aspnetcore-runtime-9.0 aspnetcore-runtime-dbg-9.0 aspnetcore-targeting-pack-9.0 dotnet-apphost-pack-9.0 dotnet-host dotnet-hostfxr-9.0 dotnet-runtime-9.0 dotnet-runtime-dbg-9.0 dotnet-sdk-9.0 dotnet-sdk-aot-9.0 dotnet-sdk-dbg-9.0 dotnet-targeting-pack-9.0 dotnet-templates-9.0 netstandard-targeting-pack-2.1 dotnet-sdk-9.0-source-built-artifacts"


URI_aspnetcore-runtime-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-runtime-9.0 = "
 dotnet-runtime-9.0
"

URI_aspnetcore-runtime-dbg-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-dbg-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-runtime-dbg-9.0 = "
 aspnetcore-runtime-9.0
"

URI_aspnetcore-targeting-pack-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-targeting-pack-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspnetcore-targeting-pack-9.0 = "
 dotnet-host
"

URI_dotnet-apphost-pack-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-apphost-pack-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-apphost-pack-9.0 = "
 zlib-ng-compat
 openssl-libs
 libgcc
 libbrotli
 libstdc++
 glibc
 dotnet-host
"

URI_dotnet-host = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-host-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-host = "
 glibc
 libgcc
 libstdc++
"

URI_dotnet-hostfxr-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-hostfxr-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-hostfxr-9.0 = "
 glibc
 libgcc
 libstdc++
 dotnet-host
"

URI_dotnet-runtime-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-runtime-9.0 = "
 zlib-ng-compat
 openssl-libs
 libgcc
 libbrotli
 dotnet-hostfxr-9.0
 libstdc++
 glibc
 libicu
"

URI_dotnet-runtime-dbg-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-dbg-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-runtime-dbg-9.0 = "
 dotnet-runtime-9.0
"

URI_dotnet-sdk-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-9.0-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-9.0 = "
 libgcc
 dotnet-targeting-pack-9.0
 dotnet-templates-9.0
 libstdc++
 netstandard-targeting-pack-2.1
 aspnetcore-targeting-pack-9.0
 dotnet-runtime-9.0
 glibc
 dotnet-apphost-pack-9.0
 aspnetcore-runtime-9.0
"

URI_dotnet-sdk-aot-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-aot-9.0-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-aot-9.0 = "
 zlib-ng-compat
 brotli-devel
 zlib-ng-compat-devel
 libgcc
 openssl-libs
 libbrotli
 clang
 openssl-devel
 libstdc++
 bash
 dotnet-sdk-9.0
 glibc
"

URI_dotnet-sdk-dbg-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-dbg-9.0-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-dbg-9.0 = "
 dotnet-sdk-9.0
"

URI_dotnet-targeting-pack-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-targeting-pack-9.0-9.0.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-targeting-pack-9.0 = "
 dotnet-host
"

URI_dotnet-templates-9.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-templates-9.0-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-templates-9.0 = "
 dotnet-host
"

URI_netstandard-targeting-pack-2.1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netstandard-targeting-pack-2.1-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:netstandard-targeting-pack-2.1 = "
 dotnet-host
"

URI_dotnet-sdk-9.0-source-built-artifacts = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dotnet-sdk-9.0-source-built-artifacts-9.0.111-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotnet-sdk-9.0-source-built-artifacts = ""
