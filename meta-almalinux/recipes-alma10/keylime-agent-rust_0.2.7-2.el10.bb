
inherit dnf-bridge

PN = "keylime-agent-rust"
PE = "0"
PV = "0.2.7"
PR = "2.el10"
PACKAGES = "keylime-agent-rust"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/keylime-agent-rust-0.2.7-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_keylime-agent-rust = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-agent-rust-0.2.7-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_keylime-agent-rust}"
RDEPENDS:keylime-agent-rust = " \
 util-linux-core \
 openssl-libs \
 libgcc \
 bash \
 keylime-base \
 tpm2-tss \
 glibc \
"
