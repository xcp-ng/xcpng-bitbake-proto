
inherit dnf-bridge

PN = "rust-ssh-key-dir"
PE = "0"
PV = "0.1.4"
PR = "9.el10"
PACKAGES = "ssh-key-dir"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rust-ssh-key-dir-0.1.4-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ssh-key-dir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ssh-key-dir-0.1.4-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ssh-key-dir}"
RDEPENDS:ssh-key-dir = " \
 systemd \
 openssh-server \
 libgcc \
 bash \
 glibc \
"
