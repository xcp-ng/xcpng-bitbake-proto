
PN = "ipxe"
PE = "0"
PV = "20240119"
PR = "5.gitde8a0821.el10"
PACKAGES = "ipxe-bootimgs-aarch64 ipxe-bootimgs-x86 ipxe-roms-qemu"


URI_ipxe-bootimgs-aarch64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipxe-bootimgs-aarch64-20240119-5.gitde8a0821.el10.noarch.rpm;unpack=0"
RDEPENDS:ipxe-bootimgs-aarch64 = ""
RPROVIDES:ipxe-bootimgs-aarch64 = "ipxe-bootimgs-aarch64 ( =  20240119-5.gitde8a0821.el10)"

URI_ipxe-bootimgs-x86 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipxe-bootimgs-x86-20240119-5.gitde8a0821.el10.noarch.rpm;unpack=0"
RDEPENDS:ipxe-bootimgs-x86 = ""
RPROVIDES:ipxe-bootimgs-x86 = "ipxe-bootimgs ( =  20240119-5.gitde8a0821.el10) ipxe-bootimgs-x86 ( =  20240119-5.gitde8a0821.el10)"

URI_ipxe-roms-qemu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipxe-roms-qemu-20240119-5.gitde8a0821.el10.noarch.rpm;unpack=0"
RDEPENDS:ipxe-roms-qemu = ""
RPROVIDES:ipxe-roms-qemu = "ipxe-roms-qemu ( =  20240119-5.gitde8a0821.el10)"
