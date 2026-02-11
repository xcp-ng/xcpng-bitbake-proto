
PN = "ignition"
PE = "0"
PV = "2.21.0"
PR = "2.el10_0"
PACKAGES = "ignition ignition-edge ignition-grub ignition-validate"


URI_ignition = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ignition-2.21.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ignition = " \
 libuuid \
 libgcc \
 libblkid \
 libstdc++ \
 bash \
 popt \
 dracut \
 dosfstools \
 glibc \
 dracut-network \
"

URI_ignition-edge = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ignition-edge-2.21.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ignition-edge = " \
 bash \
"

URI_ignition-grub = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ignition-grub-2.21.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ignition-grub = ""

URI_ignition-validate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ignition-validate-2.21.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ignition-validate = " \
 glibc \
"
