
PN = "python-virt-firmware"
PE = "0"
PV = "24.11"
PR = "2.el10_0"
PACKAGES = "python3-virt-firmware uki-direct python3-virt-firmware-tests"


URI_python3-virt-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-virt-firmware-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-virt-firmware = " \
 python3 \
 python3-pefile \
 python3-cryptography \
 python3-setuptools \
"

URI_uki-direct = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uki-direct-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:uki-direct = " \
 python3-virt-firmware \
 bash \
"

URI_python3-virt-firmware-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-virt-firmware-tests-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-virt-firmware-tests = " \
 python3-virt-firmware \
 python3-pytest \
 bash \
 edk2-ovmf \
"
