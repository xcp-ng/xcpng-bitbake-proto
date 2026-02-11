
PN = "cockpit-machines"
PE = "0"
PV = "328.2"
PR = "1.el10_0"
PACKAGES = "cockpit-machines cockpit-machines"


URI_cockpit-machines = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-machines-328.2-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-machines = " \
 libvirt-daemon-config-network \
 libvirt-daemon-driver-network \
 libvirt-daemon-driver-nodedev \
 virt-install \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-storage-core \
 qemu-kvm \
 cockpit-bridge \
 libvirt-dbus \
 libvirt-client \
"

URI_cockpit-machines = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cockpit-machines-328.2-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cockpit-machines = " \
 libvirt-daemon-config-network \
 libvirt-daemon-driver-network \
 libvirt-daemon-driver-nodedev \
 virt-install \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-storage-core \
 qemu-kvm \
 cockpit-bridge \
 libvirt-dbus \
 libvirt-client \
"
