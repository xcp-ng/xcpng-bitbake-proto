
inherit dnf-bridge

PN = "dotnet8.0"
PE = "0"
PV = "8.0.121"
PR = "1.el10_0"
PACKAGES = "aspnetcore-runtime-8.0 aspnetcore-runtime-dbg-8.0 aspnetcore-targeting-pack-8.0 dotnet-apphost-pack-8.0 dotnet-hostfxr-8.0 dotnet-runtime-8.0 dotnet-runtime-dbg-8.0 dotnet-sdk-8.0 dotnet-sdk-dbg-8.0 dotnet-targeting-pack-8.0 dotnet-templates-8.0 dotnet-sdk-8.0-source-built-artifacts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dotnet8.0-8.0.121-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_aspnetcore-runtime-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_aspnetcore-runtime-8.0}"
RDEPENDS:aspnetcore-runtime-8.0 = " \
 dotnet-runtime-8.0 \
"

URI_aspnetcore-runtime-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-runtime-dbg-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_aspnetcore-runtime-dbg-8.0}"
RDEPENDS:aspnetcore-runtime-dbg-8.0 = " \
 aspnetcore-runtime-8.0 \
"

URI_aspnetcore-targeting-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aspnetcore-targeting-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_aspnetcore-targeting-pack-8.0}"
RDEPENDS:aspnetcore-targeting-pack-8.0 = " \
 dotnet-host \
"

URI_dotnet-apphost-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-apphost-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-apphost-pack-8.0}"
RDEPENDS:dotnet-apphost-pack-8.0 = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libstdc++ \
 glibc \
 dotnet-host \
"

URI_dotnet-hostfxr-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-hostfxr-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-hostfxr-8.0}"
RDEPENDS:dotnet-hostfxr-8.0 = " \
 glibc \
 libgcc \
 libstdc++ \
 dotnet-host \
"

URI_dotnet-runtime-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-runtime-8.0}"
RDEPENDS:dotnet-runtime-8.0 = " \
 zlib-ng-compat \
 dotnet-hostfxr-8.0 \
 openssl-libs \
 libgcc \
 libstdc++ \
 glibc \
 libicu \
"

URI_dotnet-runtime-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-runtime-dbg-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-runtime-dbg-8.0}"
RDEPENDS:dotnet-runtime-dbg-8.0 = " \
 dotnet-runtime-8.0 \
"

URI_dotnet-sdk-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-sdk-8.0}"
RDEPENDS:dotnet-sdk-8.0 = " \
 libgcc \
 dotnet-targeting-pack-8.0 \
 dotnet-apphost-pack-8.0 \
 netstandard-targeting-pack-2.1 \
 libstdc++ \
 dotnet-templates-8.0 \
 aspnetcore-targeting-pack-8.0 \
 dotnet-runtime-8.0 \
 glibc \
 aspnetcore-runtime-8.0 \
"

URI_dotnet-sdk-dbg-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-sdk-dbg-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-sdk-dbg-8.0}"
RDEPENDS:dotnet-sdk-dbg-8.0 = " \
 dotnet-sdk-8.0 \
"

URI_dotnet-targeting-pack-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-targeting-pack-8.0-8.0.21-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-targeting-pack-8.0}"
RDEPENDS:dotnet-targeting-pack-8.0 = " \
 dotnet-host \
"

URI_dotnet-templates-8.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotnet-templates-8.0-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-templates-8.0}"
RDEPENDS:dotnet-templates-8.0 = " \
 dotnet-host \
"

URI_dotnet-sdk-8.0-source-built-artifacts = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dotnet-sdk-8.0-source-built-artifacts-8.0.121-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotnet-sdk-8.0-source-built-artifacts}"
RDEPENDS:dotnet-sdk-8.0-source-built-artifacts = ""
