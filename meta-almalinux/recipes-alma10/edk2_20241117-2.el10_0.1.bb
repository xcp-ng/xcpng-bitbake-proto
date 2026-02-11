
PN = "edk2"
PE = "0"
PV = "20241117"
PR = "2.el10_0.1"
PACKAGES = "edk2-aarch64 edk2-ovmf edk2-aarch64 edk2-ovmf edk2-tools edk2-tools-doc"


URI_edk2-aarch64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/edk2-aarch64-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-aarch64 = ""

URI_edk2-ovmf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/edk2-ovmf-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-ovmf = ""

URI_edk2-aarch64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-aarch64-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-aarch64 = ""

URI_edk2-ovmf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-ovmf-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-ovmf = ""

URI_edk2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-tools-20241117-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:edk2-tools = "
 glibc
 libgcc
 bash
 libstdc++
"

URI_edk2-tools-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-tools-doc-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-tools-doc = ""
